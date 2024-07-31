
let toggle = "arrow";

function changetox() {
  console.log(toggle);
  if (toggle === "arrow") {
    document.getElementById("arrow").classList.add("hidden");
    document.getElementById("cross").classList.remove("hidden");
    toggle = "cross";
  } else {
    document.getElementById("cross").classList.add("hidden");
    document.getElementById("arrow").classList.remove("hidden");
    toggle = "arrow";
  }
}