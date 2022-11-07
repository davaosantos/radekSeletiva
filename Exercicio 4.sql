SELECT 
CASE 
    when a.valor < 70 then NULL
    when a.valor >= 70 then a.nome
END as nome,
n.id As nota, a.valor
from Alunos a 
INNER JOIN
NOTAS n on (a.valor >= n.valor_min AND a.valor <= n.valor_max)
ORDER BY 
n.id DESC, a.valor DESC;