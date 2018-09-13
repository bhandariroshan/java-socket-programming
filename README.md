# Java Socket Programming Example

Simple client-server socket programming in Java. This program will be used to transfer files from client to server. 
Server will be listening on a port (say port# 5050) and Client will connect to Server and transfer files to Server. 

Client accepts command line parameter to set the number of concurrent file transfers. 
For example, java Client 5 will transfer five files concurrently at any given time as long as there are enough files.  
If concurrency number is not entered, it should transfer one file at a time (aka concurrency=1), by default.

# Files
1. Client.java: Client Application to make socket connection with the Server.
2. Server.java: Server Application to accept socket connection from client. This can accept multiple connection.
3. FileTransfer.java: Scans all the files inside client directory and transfers it to server based on the concurrency factor sent by Client.java
4. FileDownload.java: when a connection is made at a port by the client for file transfer, Server accepts the connection request and sends it to FileDownload which ultimately downlods file in the connection and saves it in the server directory.

# Testing the program - Test Scenarios

1. Create a dataset with 100 files each 10MB size and transfer with concurrency 1, 2,4 and 8 and measure throughput
2. Create a dataset with 10 files each 1GB size and transfer with concurrency 1, 2, 4 and 8 and measure throughput
3. Combine above two datasets in a single dataset and transfer with concurrency 1,2,4 and 8 and measure throughput

# Generating Test Case 
1. Install python
2. From terminal run python producefile.py

    -- To produce 10MB file, type 10

    -- To produce 1GB file, type 1000

Note: data will be produced inside client directory

After tests are done, draw figure for each tests case in item#2 where x-axis is concurrency value and y-axis is throughput.

# Compiling the program
 1. Use the command `javac -cp . -Xlint:deprecation Client.java` from terminal. It will generate Client.class file
 2. Use the command `javac -cp . -Xlint:deprecation Server.java` from terminal. It will generate Server.class file
 
 # Running the program
 1. Go to terminal, type `java Server`. This will run Server
 2. Open another terminal, type `java Client`, enter concurrenct when promted, this will run client and start making file transfer to the server.
 
