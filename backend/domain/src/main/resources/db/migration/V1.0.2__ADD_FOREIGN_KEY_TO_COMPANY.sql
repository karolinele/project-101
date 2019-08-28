-- TODO Add a foreign key column to employee-table refrencing company-table
CREATE TABLE CompanyEmployees (
   // OrderID int NOT NULL,
   // OrderNumber int NOT NULL,
   // PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (Employee) REFERENCES Company(PersonID)
);