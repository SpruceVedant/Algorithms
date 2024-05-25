const express = require('express');
const nodemailer = require('nodemailer');
const mongoose = require('mongoose');
require('dotenv').config();

mongoose.connect(process.env.MONGO_URI, { useNewUrlParser: true, useUnifiedTopology: true });

const emailSchema = new mongoose.Schema({
  subject: String,
  body: String,
  recipients: [String]
});

const Email = mongoose.model('Email', emailSchema);

const app = express();
app.use(express.json());

const transporter = nodemailer.createTransport({
  service: 'SendGrid',
  auth: {
    user: 'apikey',
    pass: process.env.SENDGRID_API_KEY
  }
});

app.post('/send', async (req, res) => {
  const { subject, body, recipients } = req.body;

  try {
    const email = new Email({ subject, body, recipients });
    await email.save();

    const mailOptions = {
      from: 'your-email@example.com',
      to: recipients,
      subject: subject,
      text: body,
      html: `<p>${body}</p>`
    };

    transporter.sendMail(mailOptions, (error, info) => {
      if (error) {
        return res.status(500).send(error.toString());
      }
      res.status(200).send('Emails sent: ' + info.response);
    });
  } catch (error) {
    res.status(500).send(error.toString());
  }
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
