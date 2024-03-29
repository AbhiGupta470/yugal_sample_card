import React from 'react';

function ProductList() {
  return (
    <div className="container">
      <div className="title">PRODUCT LIST</div>
      <div className="listProduct">
        <a href="#" className="item">
          <img
            src="https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8bmlrZSUyMHNob2V8ZW58MHx8MHx8fDA%3D"
            alt="..."
          />
          <h2>LD01 LOUNGE CHAIR</h2>
          <div className="price">$200</div>
        </a>
        {/* Include other <a> elements as needed */}
      </div>
    </div>
  );
}

export default ProductList;
