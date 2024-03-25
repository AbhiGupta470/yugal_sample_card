import express from "express";
import { adminOnly } from "../middlewares/auth.js";
import { deleteProduct, getAdminProducts, getAllCategories, getSingleProduct, getlatestProducts, newProduct, updateProduct, } from "../controllers/product.js";
import { singleUpload } from "../middlewares/multer.js";
const app = express.Router();
// To Create New Product - /api/v1/product/new
app.post("/new", adminOnly, singleUpload, newProduct);
// To Get Last 10 Products - /api/v1/product/latest
app.get("/latest", getlatestProducts);
// To Get All Unique Categories - /api/v1/product/categories
app.get("/categories", getAllCategories);
// To Get All Products - /api/v1/product/admin-products
app.get("/admin-products", getAdminProducts);
app
    .route("/:id")
    .get(getSingleProduct)
    .put(singleUpload, updateProduct)
    .delete(deleteProduct);
export default app;
