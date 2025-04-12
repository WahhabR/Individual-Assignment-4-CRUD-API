<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Center Image</title>

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

        .Flamingo { background-color: pink; }
        .Bluejay { background-color: lightblue; }
        .Canary { background-color: yellow; }
        .Parrot { background: linear-gradient(to right, red, orange, yellow, green, blue, indigo, violet); }
        .Hummingbirds { background-color: lightgreen; }
    </style>
</head>

<body>

<h1>A Sanctuary of Birds</h1>

<#list birdList as bird>
<a href="/birds/${bird.birdId?c}" style="text-decoration: none; color: inherit;">
<img src="${bird.img_url}" alt="${bird.species}">
<div class="box ${bird.species}">
    <h2>${bird.species}</h2>
    <p>${bird.description}</p>
</div>
</a>
</#list>


<form action="/birds/createForm" method="get">
    <input type="submit" value="Go to create page">
</form>

</body>
</html>
