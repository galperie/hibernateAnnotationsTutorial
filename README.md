# hibernateAnnotationsTutorial
little guide on how to easily understand hibernate annotations and use them effectively 

## Set Up
run this command to start up a mysql database in a docker container
```
 docker run --name example-mysql -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=shop -e MYSQL_USER=admin -e MYSQL_PASSWORD=pass -p 3306:3306 -d mysql:5.6
```