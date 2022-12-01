document.getElementsByClassName("card-link");

function product(imageSrc,name,price){
    `<div class="card-1 card">
    <img class="product-image" src="${imageSrc}" alt="">
    <p class="text-danger">${name}</p>
    <button class="add-to-cart">Add to cart</button>
    <span class="product-price">$${price}</span>
    </div>   
      `
}