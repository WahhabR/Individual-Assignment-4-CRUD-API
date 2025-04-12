<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Update Bird</title>

  <style>
    body {
        background: linear-gradient(to bottom, lightgray, white);
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        text-align: center;
        min-height: 100vh;
    }

    h1 {
        background-color: dodgerblue;
        color: white;
        padding: 20px;
        margin: 0;
    }

    .form-container {
        width: 60%;
        margin: 30px auto;
        background-color: white;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    .form-group {
        margin-bottom: 20px;
        text-align: left;
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }

    input[type="text"], textarea, select {
        width: 100%;
        padding: 10px;
        border: 1px solid #ddd;
        border-radius: 5px;
        font-size: 16px;
        box-sizing: border-box;
    }

    textarea {
        height: 120px;
        resize: vertical;
    }

    .buttons {
        margin-top: 30px;
    }

    input[type="submit"], button {
        background-color: dodgerblue;
        color: white;
        border: none;
        padding: 12px 20px;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
        margin: 0 10px;
    }

    button.cancel {
        background-color: #999;
    }

    input[type="submit"]:hover, button:hover {
        opacity: 0.9;
    }
  </style>
</head>

<body>

<h1>A Sanctuary of Birds</h1>

<div class="form-container">
  <h2 style="color: dodgerblue; margin-top: 0;">Update Bird</h2>


  <form id="updateBirdForm" action="/birds/update/${bird.birdId?c}" method="post">

    <!-- field to store the bird ID -->
    <input type="text" id="birdId" name="birdId" value="${bird.birdId?c}" readonly/>


    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" value="${bird.name}" required>
    </div>

    <div class="form-group">
      <label for="species">Species:</label>
      <input type="text" id="species" name="species" value="${bird.species}"  required>
    </div>

    <div class="form-group">
      <label for="color">Color:</label>
      <input type="text" id="color" name="color" value="${bird.color}" required>
    </div>

    <div class="form-group">
      <label for="img_url">Image URL:</label>
      <input type="text" id="img_url" name="img_url" value="${bird.img_url}"required>
    </div>

    <div class="form-group">
      <label for="description">Description:</label>
      <textarea id="description" name="description" required>${bird.description}</textarea>
    </div>

    <div class="buttons">
      <button type="button" class="cancel">Cancel</button>
      <input type="submit" value="Update Bird">
    </div>
  </form>
</div>

<form action="/birds/all" method="get" style="margin-top: 20px;">
  <input type="submit" value="Back to Bird Gallery">
</form>

</body>
</html>