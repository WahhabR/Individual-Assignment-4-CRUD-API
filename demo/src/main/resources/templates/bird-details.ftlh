<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>



    <style>
        body {
            background: linear-gradient(to bottom, lightgray, white);
            text-align: center;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        h1 {
            background-color: dodgerblue;
            color: white;
            padding: 20px;
            margin: 0;
        }

        img {
            display: block;
            margin: auto;
            width: 540px;
            height: 492px;
            border-radius: 10px;
        }

        .box {
            padding: 20px;
            margin: 20px auto;
            width: 50%;
            border-radius: 10px;
        }

        .flamingo { background-color: coral; }


     </style>

</head>
<body>

<h1>More Information</h1>

<!--<img src="https://transforms.stlzoo.org/production/animals/caribbean-flamingo-01-01.jpg?w=1200&h=1544&auto=compress%2Cformat&fit=crop&crop=focalpoint&fp-x=0.4991&fp-y=0.1895&dm=1670880558&s=2b3e616f7ea76cae36a65cb524a3d3f1">-->
<img src="${bird.img_url}?w=1200&h=1544&auto=compress%2Cformat&fit=crop&crop=focalpoint&fp-x=0.4991&fp-y=0.1895&dm=1670880558&s=2b3e616f7ea76cae36a65cb524a3d3f1" alt="${bird.name}">

<div class="box flamingo">
    <h2>${bird.name}</h2>
    <p>${bird.color}</p>
</div>

<form action="/birds/all" method="get">
    <input type="submit" value="Go to home page">
</form>

<form action="/birds/update/${bird.birdId?c}" method="get">
    <input type="submit" value="Update bird">
</form>

<form action="/birds/delete/${bird.birdId?c}" method="get">
    <input type="submit" value="Delete bird">
</form>




</body>
</html>