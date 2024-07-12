#author: David Coronel
  #language:es

Característica: Abrir una pagina web

  Yo como David
  Quiero realizar una prueba de abrir una pagina
  Para realizar la compra de dos productos

  Antecedentes:
    Dado "David" abre el sitio web de pruebas

  @succesful
  Esquema del escenario: abrir con el navegador edge
#Agregar dos productos al carrito y visualizar el carrito
    Cuando selecciono un producto del catalogo
    Y agrego el producto al carrito
    Y veo al carrito
    Cuando ingreso datos "<name>" "<country>" "<city>" "<credit_card>" "<month>" "<year>"
    Entonces selecciono purchase
    Ejemplos:

      | name  | country | city  | credit_card | month | year |
      | David | Ecuador | Quito | 12345678    | Enero | 2010 |
