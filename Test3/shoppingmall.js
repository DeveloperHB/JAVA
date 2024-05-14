// Sample JavaScript code for dynamically generating product cards
const productsContainer = document.getElementById('products');

const products = [
    { name: 'T-Shirt', price: 19.99, image: 'tshirt.jpg' },
    { name: 'Jeans', price: 39.99, image: 'jeans.jpg' },
    { name: 'Dress', price: 49.99, image: 'dress.jpg' }
];

function renderProducts() {
    products.forEach(product => {
        const card = document.createElement('div');
        card.classList.add('product-card');
        card.innerHTML = `
            <img src="${product.image}" alt="${product.name}">
            <h2>${product.name}</h2>
            <p>$${product.price.toFixed(2)}</p>
            <button>Add to Cart</button>
        `;
        productsContainer.appendChild(card);
    });
}

renderProducts();
