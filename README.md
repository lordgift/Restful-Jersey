# Restful-Jersey

##RestJersey1 

Jersey version 1.x

created by 
* Group Id : com.sun.jersey.archetypes
* Artifact Id : jersey-quickstart-webapp
* Version : 1.19

##RestJersey2

Jersey version 2.x

created by 
* Group Id : org.glassfish.jersey.archetypes
* Artifact Id : jersey-quickstart-webapp
* Version : 2.22.1

```
Project : Maven Project
Editor : Eclipse Mars
Application Server : WildFly 9
```


JSON

MediaType : application/xml 
```xml
    <appdata>
        <items>
            <itemid>1</itemid>
            <itemname>My Item</itemname>
        </items>
        <orderdate>12/02/2559</orderdate>
        <orderid>33</orderid>
    </appdata>
```

MediaType : application/json
```json     
    {
      "items": [
        {
          "itemId": 1,
          "itemName": "My Item"
        }
      ],
      "orderDate": "12/02/2559",
      "orderId": 33
    }
```