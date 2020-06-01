from flask import Flask, render_template, request, redirect
app = Flask(__name__)

@app.route('/')
def index():
    return render_template("index.html")

@app.route('/checkout', methods=['POST'])
def checkout():
    print(request.form)
    strawberry_from_form = request.form["strawberry"]
    raspberry_from_form = request.form["raspberry"]
    apple_from_form = request.form["apple"]
    firstname_from_form = request.form["first_name"]
    lastname_from_form = request.form["last_name"]
    studentid_from_form = request.form["student_id"]
    count = int(strawberry_from_form) + int(raspberry_from_form) + int(apple_from_form)
    print(f"Charging {firstname_from_form} {lastname_from_form} for {count} fruits")
    return render_template("checkout.html",
    strawberry_on_template=strawberry_from_form,
    raspberry_on_template=raspberry_from_form,
    apple_on_template=apple_from_form,
    firstname_on_template=firstname_from_form,
    lastname_on_template=lastname_from_form,
    studentid_on_template=studentid_from_form)

@app.route('/fruits')
def fruits():
    return render_template("fruits.html")

if __name__=="__main__":
    app.run(debug=True)