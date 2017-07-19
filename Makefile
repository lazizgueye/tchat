All: server

server: compile launch
	java -Djava.security.policy=security.policy ChatServerImpl

client:	
	java -Djava.security.policy=security.policy Menu
	#java -Djava.security.policy=security.policy ChatClientImpl


launch:
	killall rmiregistry
	rmiregistry &
	#sh launc
	

compile:
	javac ChatServerImpl.java
	rmic ChatServerImpl
	javac ChatClientImpl.java
	javac Menu.java
	

clean:
	rm -rf *.class
	


	
