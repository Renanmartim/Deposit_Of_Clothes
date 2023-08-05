# Deposit_Of_Clothes

<pre>
git clone https://github.com/[your-username]/stock-management-api.git
cd stock-management-api
mvn clean install
</pre>
<h2>Execution</h2>

To run the API you will need to start Spring Boot using the following command:

<pre>
java -jar target/stock-management-api-0.0.1-SNAPSHOT.jar
</pre>
<h2>Endpoints</h2>

The API provides the following endpoints:

<ul>
<li>/products: Gets a list of all products.</li>
<li>/products/price-biggest: Gets a list of all products from biggest to smallest.</li>
<li>/products/price-lowest: Gets a list of all products from smallest to largest.</li>
<li>/products/save: Creates a new product.</li>
<li>/products/put: Updates an existing product.</li>
<li>/products/delete/{name}: Deletes an existing product.</li>
</ul>

<h2>Examples of requests</h2>

Here are some examples of requests you can use to interact with the API:

<ul>
<li>Get a list of all products:
<pre>
GET http://localhost:8080/products
</pre>
</li>
<li>Get a specific product by ID:
<pre>
GET http://localhost:8080/products/1
</pre>
</li>
<li>Create a new product:
<pre>
POST http://localhost:8080/products
{
   "name": "Product Name",
   "description": "Product Description",
   "price": 100.00
}
</pre>
</li>
<li>Update an existing product:
<pre>
PUT http://localhost:8080/products/1
{
   "name": "New Product Name",
   "description": "New Product Description",
   "price": 200.00
}
</pre>
</li>
<li>Delete an existing product:
<pre>
DELETE http://localhost:8080/products/1
</pre>
</li>
</ul>
