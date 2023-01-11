DBMS 
It is a set of applications or programs that enable users to create and maintain a database. CRUD operations are performed.
Advantages:-
- Data sharing
- Integrating constraints
- Controlling redundancy in a db
- Data independence

DDl(Data definition language)
- It contains commands which are require to define a database. Eg- CREATE,ALTER,DROP,DELETE,TRUNCATE,RENAME.

DML(Data Manipulation Language)
- It contains commands which manipulates the data present in the db.E.g., SELECT, UPDATE, INSERT, DELETE, etc.

DCL(Data control language)
- It contains commands which are required to deal with the user permissions and controls of the database system.E.g., GRANT and REVOKE.

TCL(Transaction Control Language)
- It contains commands which are required to deal with the transaction of the database.E.g., COMMIT, ROLLBACK, and SAVEPOINT

RDBMS
It is used to access and store data more effficiently than DBMS.


ACID PROPERTIES(Atomicity,Consistency,Isolated,Durable)
- Atomicity : This property reflects the concept of either executing the whole query or executing nothing at all.
- which implies that if an update occurs in a database then that update should either be reflected in the whole database or should not be reflected at all.

- Consistency: This property ensures that the data remains consistent before and after a transaction in a database.

- Isolation: This property ensures that each transaction is occurring independently of the others. 
- This implies that the state of an ongoing transaction doesn’t affect the state of another ongoing transaction.

- Durability: This property ensures that the data is not lost in cases of a system failure or restart and is present in the same state as it was before the system failure or restart.


DATA WAREHOUSING
- The process of collecting,transforming,extracting and loading of data from multiple sources and storing them in one database.

DATA ABSTRACTION
- The process of hiding irrelevant details from users is known as data abstraction.
     --Physical Level
       it is the lowest level and is managed by DBMS. 
       This level consists of data storage descriptions and the details of this level are typically hidden from system admins, developers, and users.
       
     --Conceptual or Logical level
       it is the level on which developers and system admins work and
       it determines what data is stored in the database and what is the relationship between the data points.
       
     --External or View level
       it is the level that describes only part of the database and hides the details of the table schema and its physical storage from the users. 
       The result of a query is an example of View level data abstraction. 
        
        
