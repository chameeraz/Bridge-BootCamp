const data = {
  products: [
    {
      image: '../images/1.png',
      name: 'Samsung Galaxy A71',
      Price: '390',
      class: 'samsung mobile',
      number: 1,
    },
    {
      image: '../images/2.jpeg',
      name: 'Apple iphone 12',
      Price: '50',
      class: 'apple mobile',
      number: 2,
    },
    {
      image: '../images/3.jpg',
      name: 'Samsung Galaxy M51',
      Price: '344',
      class: 'samsung mobile',
      number: 3,
    },
    {
      image: '../images/4.jpg',
      name: 'Samsung Galaxy M31',
      Price: '290',
      class: 'samsung mobile',
      number: 4,
    },
    {
      image: '../images/5.jpg',
      name: 'Samsung Galaxy S20 Ultra',
      Price: '1399',
      class: 'samsung mobile',
      number: 5,
    },
    {
      image: '../images/6.jpeg',
      name: 'Apple iPhone 11',
      Price: '749',
      class: 'apple mobile',
      number: 6,
    },
    {
      image: '../images/headphones.png',
      name: 'Apple Beats Studio3 ',
      Price: '200',
      class: 'apple',
      number: 7,
    },
    {
      image: '../images/s20cover.jpg',
      name: 'Samsung Galaxy S20 Cover',
      Price: '56',
      class: 'samsung',
      number: 8,
    },
    {
      image: '../images/wireless.png',
      name: 'BeatsX sports earphones',
      Price: '100',
      class: 'apple',
      number: 9,
    },
    {
      image: '../images/wirelessduocharge.jpeg',
      name: 'Wireless trio Charge',
      Price: '219',
      class: 'apple',
      number: 10,
    },
    {
      image: '../images/travelcharge.jpg',
      name: 'Portable charger',
      Price: '30',
      class: 'apple',
      number: 11,
    },
    {
      image: '../images/airpods.png',
      name: 'Apple Airpods',
      Price: '299',
      class: 'apple',
      number: 12,
    },
  ],
};

var products = data.products;
//console.log(products);

function showAll() {
  document.querySelectorAll('.card').forEach(function (el) {
    el.style.display = 'block';
  });
}

function hideAll() {
  document.querySelectorAll('.card').forEach(function (el) {
    el.style.display = 'none';
  });
}

function show(className) {
  hideAll();
  document.querySelectorAll(className).forEach(function (el) {
    el.style.display = 'block';
  });
}

function RenderProducts() {
  document.getElementById('card-container').innerHTML = products
    .map(
      (products) =>
        `<div class="col">
            <div class="card h-100 shadow-sm">
                <img src="${products.image}"
                    class="card-img-top" alt="...">
                <div class="card-body">
                    <div class="clearfix mb-3">
                        <span class="float-start badge rounded-pill bg-primary">
                            ${products.name}
                        </span>
                        <span class="float-end price-hp">$ ${products.Price}</span>
                    </div>
                    <h5 class="card-title">
                        Buy Mobiles with 2 Year Warranty
                        
                    </h5>
                    <div class="d-grid gap-2 my-4">
                        <a class="btn btn-warning" onclick="addToCart(${products.number})">
                            Add To Cart
                        </a>
                    </div>
                </div>
            </div>
        </div>`
    )
    .join('');
}

window.onload = function () {
  RenderProducts();
};

let item = [];
let bill = [];

function addToCart(x) {
  Swal.fire('Done!', 'Product added to cart!', 'success');

  const span = `<span class="price">${products[x].Price}</span>`;
  const result = products[x].name + ' ' + span;
  if (item.includes(products[x]) === false) item.push(result);
  bill.push(products[x].Price);
}

function cart() {
  document.getElementById('list').innerHTML = '';
  for (let i = 0; i < item.length; i++) {
    let text = item[i];
    let listItem = document.createElement('LI');
    listItem.innerHTML = text;
    list.appendChild(listItem);
    listItem.style.textAlign = 'left';
  
  }
  const btn = document.querySelector('.bill');
  const total = bill.reduce(add);

  function add(accumulator, a) {
    return parseInt(accumulator) + parseInt(a);
  }
  console.log(total);
  btn.innerHTML = `Total Bill is $ ${total}`;
}
