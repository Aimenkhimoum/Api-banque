import { useState, useEffect } from 'react'
import axios from 'axios'

function App() {
  const [comptes, setComptes] = useState([])

  useEffect(() => {
    // Appel vers votre serveur Spring Boot
    axios.get('http://20.215.192.13:8080/api/comptes')
      .then(reponse => {
        setComptes(reponse.data)
      })
      .catch(erreur => {
        console.error("Erreur de connexion à l'API", erreur)
      })
  }, [])

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      <h1>Espace Client X-BLOCKS</h1>
      
      <table border="1" cellPadding="10" style={{ borderCollapse: 'collapse', width: '100%' }}>
        <thead style={{ backgroundColor: '#f2f2f2' }}>
          <tr>
            <th>ID</th>
            <th>Titulaire</th>
            <th>Solde</th>
          </tr>
        </thead>
        <tbody>
          {comptes.map(compte => (
            <tr key={compte.id}>
              <td>{compte.id}</td>
              <td>{compte.titulaire}</td>
              <td>{compte.solde} €</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  )
}

export default App