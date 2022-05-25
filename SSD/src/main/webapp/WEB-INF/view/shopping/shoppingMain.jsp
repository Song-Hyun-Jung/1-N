<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

 <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
      
      .category-list-area .category-list-wrapper{
      display:flex;
      justify-content:center;
      flex-wrap:wrap;
      margin:0 -15px
      }
      .category-list-area .category-list-wrapper .category-list-item a{
      display:block;
      text-align:center;
      width:210px;
      background:#fff;
      border-radius:5px;
      padding:40px 25px;
      margin:15px;
      border:1px solid rgba(124,134,154,.25);
      box-shadow:0 3px 35px rgba(218,222,228,.3)
      }
      .category-list-area .category-list-wrapper .category-list-item a:hover
      {
      background-color:#ff6b6b
      }
      .category-list-area .category-list-wrapper .category-list-item a:hover .icon,.category-list-area .category-list-wrapper .category-list-item a:hover h3
      {
      color:#fff
      }
      .category-list-area .category-list-wrapper .category-list-item a .icon
      {
      font-size:35px;
      margin-bottom:10px;
      line-height:1;
      color:#ff6b6b;
      transition:all .3s ease-out 0s
      }
      .category-list-area .category-list-wrapper .category-list-item a h3
      {
      font-weight:400;
      color:#333f57;
      transition:all .3s ease-out 0s
      }
    </style>
</head>
<body>
<div class="row">
<div class="col-4"></div>
<div class="col-4">
	<form>
         <input type="search" class="form-control" placeholder="Search..." aria-label="Search">
    </form>
</div>
<div class="col-4"></div>
</div>
	
<main>
<div class="album py-5 bg-light">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
        <div class="col">
          <div class="card shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>

            <div class="card-body">
              <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                </div>
                <small class="text-muted">가격</small>
              </div>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>

            <div class="card-body">
              <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                </div>
                <small class="text-muted">가격</small>
              </div>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>

            <div class="card-body">
              <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                </div>
                <small class="text-muted">가격</small>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
   </div>
 </main>
 <section class="category-list-area pt-130">
 <div class="container">
<div class="category-list-wrapper">
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	<div class="category-list-item">
	<a href="category.html">
	<h3>col</h3>
	</a>
	</div>
	
	
</div>
</section>
 
</body>
</html>