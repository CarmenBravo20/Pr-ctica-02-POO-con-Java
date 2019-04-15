
CARRERA: Computación 

ASIGNATURA: Programación Aplicada

NRO. PRÁCTICA: 02 
 
TÍTULO PRÁCTICA:  Relaciones entre   clases

OBJETIVO ALCANZADO: A partir de ejemplos de la vida real relacionados entre   sí, identificar o realizar la identificación de los objetos y posterior la   abstracción en clases, seguido de la identificación de las asociaciones, la navegabilidad,   herencia, composición, clases abstractas y anónimas.

                                    ACTIVIDADES  A DESARROLLAR


1.	Crear un repositorio en GitHub con el nombre “Práctica 02 – POO con Java”

![po (2)](https://user-images.githubusercontent.com/49033767/56104022-66711500-5efb-11e9-84de-4aff7612cab9.jpg)

2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar un commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).

3. Crear un paquete para las clases, otro para las interfaces, otro para las pruebas.

![pe (2)](https://user-images.githubusercontent.com/49033767/56103936-ecd92700-5efa-11e9-93c1-4a24c5c2d0a9.jpg)

4. Crear una jerarquía de clases de tres niveles, es decir, una clase “abuelo”, dos clases “padres” y cuatro clases “hijas” (dos de cada padre)

![pi (2)](https://user-images.githubusercontent.com/49033767/56104433-46425580-5efd-11e9-9859-2edfedeacdd6.jpg)


5.  Todas las clases   deben tener por lo menos cuatros atributos (aparte de los de herencia), tres   métodos (aparte de los getters y setters) y método toString().  
 CLASE AUTO    

![ps (2)](https://user-images.githubusercontent.com/49033767/56104482-843f7980-5efd-11e9-9acb-3fa5e73bec4f.jpg)

@Override      public String   toString() {           return   "Auto{" + "capacidad=" + capacidad + ",   comididad=" + comididad + ", descapotable=" + descapotable +   '}';       }  

 CLASE FUNCIONARIO  
   
 @Override       public String   toString() {           return   "Funcionario{" + "cargo=" + cargo + ",   salario=" + salario + ", area=" + area + ",   horario=" + horario + '}';       }    
   CLASE CLIENTE      

![a (2)](https://user-images.githubusercontent.com/49033767/56104737-ac7ba800-5efe-11e9-8bb2-446943ef38bd.jpg)

@Override       public String   toString() {           return   "Cliente{" + "formaPago=" + formaPago + ",   ruc=" + ruc + ", frecuente=" + frecuente + '}';       }  
 CLASE CAMION      

![mi (2)](https://user-images.githubusercontent.com/49033767/56104716-8eae4300-5efe-11e9-9901-866d81b15c78.jpg)
@Override       public String   toString() {           return   "Camioneta{" + "espacio=" + espacio + ",   carga=" + carga + ", pesoTara=" + pesoTara + '}';       }   
CLASE VEHICULO     
 
![pa](https://user-images.githubusercontent.com/49033767/56104697-71797480-5efe-11e9-81d4-3d7ee248a66e.jpg)


@Override       public String   toString() {           return   super.toString()+ "Vehiculo{" + "marca=" + marca +   ", color=" + color + ", modelo=" + modelo + ",   placa=" + placa + '}';       }  
 CLASE PERSONA     
 
![pis](https://user-images.githubusercontent.com/49033767/56104676-53137900-5efe-11e9-805c-3a48f0f50f72.png)
@Override       public String   toString() {           return   super.toString() + "cedula=" + cedula + ", nombre=" +   nombre + ", apellido=" + apellido + ", telefono=" +   telefono + '}';       } 
 
 CLASE CONSESIONARIO DE   VEHICULOS       
![ca (2)](https://user-images.githubusercontent.com/49033767/56104643-324b2380-5efe-11e9-9e0b-bb066e9f83b6.jpg)

@Override       public String   toString() {           return   "ConsesionarioVehiculos{" + "codigo=" + codigo + ",   direccion=" + direccion + '}';       }

6. Cada clase padre debe tener por lo menos un método   abstracto cada una.  
 CLASE PADRE (PERSONA)       
![cua (2)](https://user-images.githubusercontent.com/49033767/56104971-b520ae00-5eff-11e9-9323-f2b6b226df30.jpg)
  
 CLASE PADRE (VEHICULO)
![der (2)](https://user-images.githubusercontent.com/49033767/56105010-ebf6c400-5eff-11e9-902d-87d039b5237b.jpg)

7. Los métodos abstractos deben ser sobre escritos   (implementados) en cada clase hija. 
  CLASE AUTO
![nos (2)](https://user-images.githubusercontent.com/49033767/56105066-2bbdab80-5f00-11e9-84de-7238eab62c27.jpg)

CLASE FUNCIONARIO  
![li (2)](https://user-images.githubusercontent.com/49033767/56105107-50198800-5f00-11e9-8b84-11e1bf893bf0.jpg)
    
CLASE CAMION    
![bro (2)](https://user-images.githubusercontent.com/49033767/56105152-763f2800-5f00-11e9-89f1-4dd7dd35b870.jpg)

  CLASE CLIENTE
![es (2)](https://user-images.githubusercontent.com/49033767/56105182-92db6000-5f00-11e9-985a-2e044ef3bd88.jpg)


8. Todas las clases hijas deben ser clases finales

public final class Auto extends Vehiculo implements Acciones {

public final class Funcionario extends Persona implements Acciones{

public final class Cliente extends Persona implements Acciones {

public final class Camion extends Vehiculo implements Acciones {


9. Crear una interfaz, con al menos dos métodos abstractos.   Estos métodos deben ser implementados en cada clase hija   
![1 (2)](https://user-images.githubusercontent.com/49033767/56105594-a38cd580-5f02-11e9-983a-d8ff979931bb.jpg)
   Clase   Auto    

     ![2 (2)](https://user-images.githubusercontent.com/49033767/56105601-abe51080-5f02-11e9-9a50-4a83c62f4b1f.jpg)
 Clase   Funcionario   

    ![3 (2)](https://user-images.githubusercontent.com/49033767/56105604-b2738800-5f02-11e9-9c2f-c174689bac4e.jpg)
   Clase Cliente   
![4 (2)](https://user-images.githubusercontent.com/49033767/56105608-b69fa580-5f02-11e9-97f7-ea8c19c4394b.jpg)

        
   Clase   Camion     
![5 (2)](https://user-images.githubusercontent.com/49033767/56106057-f8315000-5f04-11e9-94bf-cb1852b502a8.jpg)

 
10. Crear una clase “Prueba”, en donde se demostrará el   funcionamiento del proyecto. Además, se pide demostrar el uso de downcasting   con el operador instanceof. También, se pide demostrar el uso de clases   anónimas.         

![6 (2)](https://user-images.githubusercontent.com/49033767/56106006-b1dbf100-5f04-11e9-8bdf-848ad870170e.jpg)

![9 (2)](https://user-images.githubusercontent.com/49033767/56106136-52caac00-5f05-11e9-8b77-863b01ac2b1a.jpg)

11.Desarrollar el diagrama de clases correspondiente   usando la herramienta LucidChart.      
![10 (2)](https://user-images.githubusercontent.com/49033767/56106151-5fe79b00-5f05-11e9-96a3-8a6df50b4a7a.jpg)

GitHub
![11 (2)](https://user-images.githubusercontent.com/49033767/56106204-9de4bf00-5f05-11e9-8208-660eb133cbc9.jpg)

RESULTADO(S) OBTENIDO(S):   Como resultado, tenemos un programa capaz de   instanciar los objetos de las diferentes clases con las que se tenga una   relación y abstraerlas para que visualizar en consola, de igual manera crear   clases anónimas.

CONCLUSIONES:   Mediante esta práctica se pudo entender el cómo   instanciar un objeto y abstraerlo y poder obtener la información, ya sean   unitarios o en lista, y manipularlos para obtener la información.

Nombre de estudiante: Carmen Bravo

