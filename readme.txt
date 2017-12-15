Run the application from a PowerShell:

1) start virtual machine
> docker-machine start mservices

2) change to this virtual machine environment
> docker-machine env mservices | Invoke-Expression

3) build the project with maven
> mvn clean package

4) start the containers
> docker-compose up -d

5) access the applications from a browser on the IP address of the virtual machine
> docker-machine ip mservices

6) stop the containers
> docker-compose down



Troubleshooting:

If the virtual machine doesn't start you may need to regenerate the certificates
> docker-machine regenerate-certificates mservices

The services are configured for a specific IP address of the virtual machine which may change.
If this is the case get the new IP address and update the yaml configuration files.