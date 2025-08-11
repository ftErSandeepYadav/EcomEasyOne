import { useEffect } from "react";
import "./App.css";
import ProductList from "./ProductList";

function App() {

  const [products, setProducts] = useState([]) ;

  useEffect(() => {
    fetch('http://localhost:8080/api/products')
    .then(Response => Response.json())
    .then(data => setProducts(data)) ;
  }, []) ;

  return (
    <div className="container">
      
      <div>
        {products.lenght ? (
          <ProductList products={products} />
        ) : (
          <p>No Product Found</p>
        ) }
      </div>

    </div>
  );
}

export default App;
