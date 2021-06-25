Pruebas Unitarias :

http://localhost:8080/reto?texto=aabbcc
SALIDA: 
   {"valid":true,"mensaje":"Todos los caracteres aparecen la misma cantidad de veces"}

http://localhost:8080/reto?texto=abcdef
SALIDA:
   {"valid":true,"mensaje":"Todos los caracteres aparecen la misma cantidad de veces"}
   
http://localhost:8080/reto?texto=aaaaaa
SALIDA:
    {"valid":true,"mensaje":"Todos los caracteres aparecen la misma cantidad de veces"}
    
    
http://localhost:8080/reto?texto=aabbccc
SALIDA:
    {"valid":false,"mensaje":"Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece una vez mas o una vez menos"}

http://localhost:8080/reto?texto=aabbc
SALIDA:
     {"valid":false,"mensaje":"Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece una vez mas o una vez menos"}
     
http://localhost:8080/reto?texto=aaaaccccc
SALIDA:
     {"valid":false,"mensaje":"Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece una vez mas o una vez menos"}

