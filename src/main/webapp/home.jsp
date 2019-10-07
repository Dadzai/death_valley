<html>
    <head>
        <title>Death Valley</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
    <div class="container mt-5">
        <form>
            <div class="input-group mb-3">
                <input type="text" class="form-control" placeholder="Richest user" aria-label="Recipient's username" aria-describedby="button-addon2" value="${richest}">
                <input type="hidden" name="clicked" value="richest">
                <div class="input-group-append">
                    <button class="btn btn-outline-secondary" type="submit">Button</button>
                </div>
            </div>
        </form>
        <form>
            <div class="input-group mb-3">
                <input type="text" class="form-control" placeholder="Accounts count" aria-label="Recipient's username" aria-describedby="button-addon2" value="${sum}">
                <input type="hidden" name="clicked" value="sum">
                <div class="input-group-append">
                    <button class="btn btn-outline-secondary" type="submit">Button</button>
                </div>
            </div>
        </form>
    </div>
    </body>
</html>