# java-socket-programming

Simple client-server socket programming in Java. This program will be used to transfer files from client to server. 
Server will be listening on a port (say port# 5050) and Client will connect to Server and transfer files to Server. 

Client accepts command line parameter to set the number of concurrent file transfers. 
For example, java Client 5 will transfer five files concurrently at any given time as long as there are enough files.  
If concurrency number is not entered, it should transfer one file at a time (aka concurrency=1), by default.

Once the code is working, please try with following test scenarios:
1. Create a dataset with 100 files each 10MB size and transfer with concurrency 1, 2,4 and 8 and measure throughput
2. Create a dataset with 10 files each 1GB size and transfer with concurrency 1, 2, 4 and 8 and measure throughput
3. Combine above two datasets in a single dataset and transfer with concurrency 1,2,4 and 8 and measure throughput

After tests are done, draw figure for each tests case in item#2 where x-axis is concurrency value and y-axis is throughput.
