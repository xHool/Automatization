const express = require('express');
const app = express();

app.use(express.json());

const persons = [
    {
        id: 1120380115,
        name: 'Willintong',
        lastname: 'Ramirez',
        age: 26,
        email: 'willintong.ramirez@sophossolutions.com',
        rol: 'ENGINEER TRAINEE I'
    },
    {
        id: 000000001,
        name: 'Nintai',
        lastname: 'Ramirez',
        age: 3,
        email: 'nintai.ramirez@outlook.com',
        rol: 'light of my heart'
    }
];

app.get('/', (req, res) => {
    res.send('Will API ');
})

app.get('/api/persons', (req, res) => {
    res.send(person);
})

app.get('/api/persons/:id', (req, res) => {
    const oPerson = persons.find(c => c.id == parseInt(req.params.id));
    if (!oPerson) {
        return res.status(404).send('Persona no encontrada!')
    } else {
        return res.send(oPerson)
    }
})

app.post('/api/persons', (req, res) => {
    const person = {
        id: persons.length + 1,
        name: req.body.name,
        lastname: req.body.lastname,
        age: req.body.age,
        email: req.body.email,
        rol: req.body.rol
    };

    persons.push(person);
    res.send(person);
})

app.delete('api/persons/:id', (req, res) => {
    const person = persons.find(c => c.id == parseInt(req.params.id));
    if (!person) {
        return res.status(404).send('Estudiante no encontrado!');
    }
    const index = persons.indexOf(person);
    persons.splice(index, 1);
    res.send(person);
})

const port = process.env.port || 80;
app.listen(port, () => console.log(`API abierta en el puerto 80`));