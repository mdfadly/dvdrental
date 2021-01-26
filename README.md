# dvdrental
Tools:
1. Postgresql
2. IDE untuk Java
3. JDK 8

Untuk melakukan test:
1. download database https://www.postgresqltutorial.com/postgresql-sample-database/
2. create database dvdrental pada postgresql dan restore data pada point 1 
3. clone project dvdrental dan import project maven dari IDE java (eclipse, sts, atau yang lainnya)
4. buka file src/main/resources/application.properties lalu ubah settingan pada aplication properties untuk username dan password postgresql
4. run Spring boot aplication
5. akses browser http://localhost:8500/swagger-ui.html
