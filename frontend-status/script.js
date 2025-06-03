function buscarStatus() {
  const nome = document.getElementById('nomeInput').value;
  const resultado = document.getElementById('resultado');
  resultado.innerHTML = 'Consultando...';

  fetch(`http://localhost:8080/api/externo/status/${nome}`)
    .then(response => {
      if (!response.ok) throw new Error('Erro na consulta');
      return response.json();
    })
    .then(data => {
      resultado.innerHTML = `
        <p><strong>Cliente:</strong> ${data.cliente}</p>
        <p><strong>Status:</strong> ${data.status}</p>
      `;
    })
    .catch(error => {
      resultado.innerHTML = '<p style="color:red;">Erro: cliente não encontrado ou API fora do ar.</p>';
    });
}
