var x={
    lName : "mahim",
    fName : "Ashraful",
    age : 25,
    fullName : function () {
        return this.fName+" "+this.lName;
    }
}

document.getElementById("text").innerHTML="name : "+x.fName+ "\nage : "+x.age+"\nfull name : "+x.fullName();