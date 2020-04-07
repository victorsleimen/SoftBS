# Docker Image:
---------------
Open new cmd window on the project location and run the following:
# To prepare the jar package for the application
> mvn clean install
 
# To prepare the image with a name
> docker build -t jcgassignment 

# Starting the Docker container
docker run -d -p 9099:9099 jcgassignment

