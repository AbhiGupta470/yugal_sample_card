import React from 'react';

function ProductDetail() {
  return (
    <div className="container">
      <div className="title">PRODUCT DETAIL</div>
      <div className="detail">
        <div className="image">
          <img
            src="https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8bmlrZSUyMHNob2V8ZW58MHx8MHx8fDA%3D"
            alt=""
          />
        </div>
        <div className="content">
          <h1 className="name">LD01 LOUNGE CHAIR</h1>
          <div className="price">$200</div>
          <div className="buttons">
            <button>Check Out</button>
            <button>
              Add To Cart
              <span>
                <svg
                  aria-hidden="true"
                  xmlns="http://www.w3.org/2000/svg"
                  width="24"
                  height="24"
                  fill="none"
                  viewBox="0 0 24 24"
                >
                  <path
                    stroke="currentColor"
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M5 4h1.5L9 16m0 0h8m-8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm-8.5-3h9.25L19 7H7.312"
                  />
                </svg>
              </span>
            </button>
          </div>
          <div className="description">
            Lorem ipsum, dolor sit amet consectetur adipisicing elit. Alias modi
            sapiente cupiditate laboriosam? Nostrum repellat laudantium eaque
            cumque. Commodi iusto, incidunt maiores quos eos assumenda
            aspernatur laboriosam molestiae odio! Doloremque?
          </div>
        </div>
      </div>
      <div className="title">SIMILAR PRODUCT</div>
      <div className="listProduct">
        <div className="item">
          {/* Include similar products as needed */}
        </div>
      </div>
    </div>
  );
}

export default ProductDetail;
