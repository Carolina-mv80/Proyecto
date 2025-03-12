const mongoose = require('mongoose'); 
 const URI = 'mongodb+srv://instructorbd:BD2024*5982@cluster0.q9py1.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0'; 
 mongoose.connect(URI)
     .then(db => console.log('DB is connected'))
     .catch(err => console.error(err));  
 module.exports = mongoose; 