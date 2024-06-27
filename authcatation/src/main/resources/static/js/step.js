
document.getElementById('file_input').addEventListener('change', function (event) {
  const file = event.target.files[0];
  if (file) {
    const reader = new FileReader();
    reader.onload = function (e) {
      document.getElementById('avatar_container').classList.remove('hidden');
      const avatar = document.getElementById('avatar');
      avatar.src = e.target.result;
      avatar.classList.remove('hidden');
      document.getElementById('image_input').classList.add('hidden');
    };
    reader.readAsDataURL(file);
  }
});

function verify() {
  document.getElementById("email").disabled = true;
  document.getElementById("verification-code").classList.remove("hidden");
  document.getElementById("verify_button").classList.add("hidden");
  document.getElementById("next_button").classList.remove("hidden");
}


document.getElementById('remove_avatar').addEventListener('click', function () {
  const avatar = document.getElementById('avatar');
  avatar.src = '';
  document.getElementById('avatar_container').classList.add('hidden');
  document.getElementById('image_input').classList.remove('hidden');
});


function focusNextInput(el, prevId, nextId) {
  if (el.value.length === 0) {
    if (prevId) {
      document.getElementById(prevId).focus();
    }
  } else {
    if (nextId) {
      document.getElementById(nextId).focus();
    }
  }
}

document.querySelectorAll('[data-focus-input-init]').forEach(function (element) {
  element.addEventListener('keyup', function () {
    const prevId = this.getAttribute('data-focus-input-prev');
    const nextId = this.getAttribute('data-focus-input-next');
    focusNextInput(this, prevId, nextId);
  });
});

function change_form() {
  document.getElementById("login_form").classList.add("hidden");
  document.getElementById("verification_form").classList.remove("hidden");
}