
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
function previewImage(event) {
  const [file] = event.target.files;
  if (file) {
    const reader = new FileReader();
    reader.onload = function (e) {
      const imagePreview = document.getElementById('avatar_container');
      const uploadIcon = document.getElementById('uploadIcon');
      document.getElementById("imagePreview").src = e.target.result;
      imagePreview.classList.remove('hidden');
      uploadIcon.classList.add('hidden');
    };
    reader.readAsDataURL(file);
  }
}
document.getElementById('remove_avatar').addEventListener('click', function () {
  const avatar = document.getElementById('avatar');
  avatar.src = '';
  document.getElementById('avatar_container').classList.add('hidden');
  document.getElementById('image_input').classList.remove('hidden');
});