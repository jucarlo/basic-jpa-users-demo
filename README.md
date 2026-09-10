### CURL

+ GET

	```
	>curl http://localhost:8080/users
	```
	<img width="1126" height="192" alt="image" src="https://github.com/user-attachments/assets/b723c116-31db-4422-be7f-354956481547" />

+ POST

	```
	>curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d "{\"name\":\"He Man\",\"email\":\"heman@email.com\"}"
	```
	<img width="1120" height="175" alt="image" src="https://github.com/user-attachments/assets/a5b1ba4b-cccc-4af1-abba-18839ac29b5e" />

+ GET
  <img width="1111" height="210" alt="image" src="https://github.com/user-attachments/assets/038e1b37-c44d-4777-8073-56cc191d41d0" />



### Postman utils

#### URL 
	```
	http://localhost:8080/users
	```
	
examples

+ GET
	```
	http://localhost:8080/users
	```
 
+ POST
	``` 
	http://localhost:8080/users
	```

	Body
	```js
	{ 
		"name":"Toño Guti",
		"email":"tono@email.com"
	}
	```
 
+ PUT
	```
	http://localhost:8080/users/1
	```
	Body
	```js
	{ 
		"name":"Toño Guti",
		"email":"tono@email.com"
	}
	```
