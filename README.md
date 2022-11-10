
# # News API

----

## How to Run

**Step 1:**

- If you use Maven, you can run the application by using: 
- `./mvnw spring-boot:run`. 


- Alternatively, you can build the JAR file with `./mvnw clean package` and then run the JAR file, as follows: 
- `java -jar target/fetchnews-0.1.0.jar`

**Step 2:**
- technology --> refers to search keywords to find the news articles
- 2 --> refers to specify the number of news articles returned by the API

```
curl -X GET http://localhost:8080/news/technology/2
```

----

## Important Note!

The API key is has not sent in the code, considering the *security*. 
It has been added to the code snippet area on *Coderbyte*, 
code can be run by typing the API key obtained from there into the relevant field in *`/resources/application.properties`*.

```
project.apikey
```

----

## Future Steps

- Extending capabilities
- Caching mechanism
- Applying CI/CD pipeline

----

## Author

#### Vehbi Çetin

[![LinkedIn Link](https://img.shields.io/badge/Connect-vehbicetin-blue.svg?logo=linkedin&longCache=true&style=social&label=Follow)](https://www.linkedin.com/in/vehbi-cetin)
&
[![GitHub Follow](https://img.shields.io/badge/Connect-vehbicetin-blue.svg?logo=Github&longCache=true&style=social&label=Follow)](https://github.com/vehbicetin)

----

## Contributions Welcome
[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](#)

If you find any bug in the code or have any improvements in mind then feel free to let me know.

----

## License

Copyright (c) 2022 - ∞, Vehbi Çetin

----