//// Smooth scrolling effect for anchor links
//document.querySelector('.btn').addEventListener('click', function(event) {
//    event.preventDefault();
//    document.querySelector('#services').scrollIntoView({ behavior: 'smooth' });
//});
//
//// Adding a scroll effect on the hero section
//window.addEventListener('scroll', function() {
//    let heroSection = document.querySelector('.hero');
//    let scrollPosition = window.scrollY;
//    
//    if (scrollPosition > 50) {
//        heroSection.style.backgroundColor = "#2980b9"; // Change to a darker blue
//    } else {
//        heroSection.style.backgroundColor = "#3498db"; // Original blue
//    }
//});

/*document.querySelector('.btn').addEventListener('click', function(event) {
    event.preventDefault();
    document.querySelector('#services').scrollIntoView({ behavior: 'smooth' });
});*/

window.addEventListener('scroll', function () {
    let heroSection = document.querySelector('.hero');
    let scrollPosition = window.scrollY;

    if (scrollPosition > 50) {
        heroSection.style.backgroundColor = "#2980b9"; // Darker blue
    } else {
        heroSection.style.backgroundColor = "#3498db"; // Original blue
    }

    // Active link highlight when services section is in view
    const servicesSection = document.querySelector('#services');
    const navServices = document.querySelector('#nav-services');

    const sectionTop = servicesSection.offsetTop;
    const sectionHeight = servicesSection.offsetHeight;

    if (scrollPosition >= sectionTop - 50 && scrollPosition < sectionTop + sectionHeight) {
        navServices.classList.add('active');
    } else {
        navServices.classList.remove('active');
    }
});

//Enrollment add
document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('enrollmentForm');
    if (!form) {
        console.error("Form not found.");
        return;
    }

    form.addEventListener('submit', async function(e) {
        e.preventDefault();

        const data = {
            courseCode: form.courseCode.value,
            startDate: form.startDate.value
        };

        try {
            const response = await fetch('/api/enrollments', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(data)
            });

            if (response.ok) {
                showSuccessPopup();
                form.reset();
            } else {
                alert('❌ Enrollment failed.');
            }
        } catch (error) {
            console.error(error);
            alert('⚠️ Network error.');
        }
    });

    function showSuccessPopup() {
        const popup = document.getElementById('successPopup');
        if (popup) {
            popup.style.display = 'block';
            setTimeout(() => popup.style.display = 'none', 3000);
        }
    }
});


//Document Request form
document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('documentRequestForm');
    if (!form) return;

    form.addEventListener('submit', async function(e) {
        e.preventDefault();

        const data = {
            fullName: form.fullName.value,
            documentType: form.documentType.value,
            additionalInfo: form.additionalInfo.value
        };

        try {
            const response = await fetch('/api/document-requests', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(data)
            });

            if (response.ok) {
                showSuccessPopup();
                form.reset();
            } else {
                alert('❌ Submission failed.');
            }
        } catch (error) {
            console.error(error);
            alert('⚠️ Network error.');
        }
    });

    function showSuccessPopup() {
        const popup = document.getElementById('successPopup');
        if (popup) {
            popup.style.display = 'block';
            setTimeout(() => popup.style.display = 'none', 3000);
        }
    }
});

//Career
document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('careerGuidanceForm');
    if (!form) {
        console.error("Form not found.");
        return;
    }

    form.addEventListener('submit', async function(e) {
        e.preventDefault();

        const data = {
            name: form.name.value,
            email: form.email.value,
            topic: form.topic.value,
            datetime: form.datetime.value
        };

        try {
            const response = await fetch('/api/career-guidance', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(data)
            });

            if (response.ok) {
                showSuccessPopup();
                form.reset();
            } else {
                alert('❌ Booking failed.');
            }
        } catch (error) {
            console.error(error);
            alert('⚠️ Network error.');
        }
    });

    function showSuccessPopup() {
        const popup = document.getElementById('successPopup');
        if (popup) {
            popup.style.display = 'block';
            setTimeout(() => popup.style.display = 'none', 3000);
        }
    }
});

//mental health 
document.addEventListener('DOMContentLoaded', () => {
       const form = document.getElementById('mentalHealthSupportForm');
       if (!form) {
           console.error("Form not found.");
           return;
       }

       form.addEventListener('submit', async function(e) {
           e.preventDefault();

           const data = {
               name: form.name.value,
               email: form.email.value,
               concern: form.concern.value,
               date: form.date.value
           };

           try {
               const response = await fetch('/api/mental-health-support', {
                   method: 'POST',
                   headers: { 'Content-Type': 'application/json' },
                   body: JSON.stringify(data)
               });

               if (response.ok) {
                   showSuccessPopup();
                   form.reset();
               } else {
                   alert('❌ Request failed.');
               }
           } catch (error) {
               console.error(error);
               alert('⚠️ Network error.');
           }
       });

       function showSuccessPopup() {
           const popup = document.getElementById('successPopup');
           if (popup) {
               popup.style.display = 'block';
               setTimeout(() => popup.style.display = 'none', 3000);
           }
       }
   });
