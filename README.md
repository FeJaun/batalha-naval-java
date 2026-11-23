\# ⚓ Batalha Naval (ThinkPad Edition) Jogo de terminal em Java puro implementando conceitos fundamentais de Orientação a Objetos, controle de fluxo e coleções dinâmicas. 
## 🚀 Mecânicas e Regras 
- \*\*Níveis de Dificuldade (Enum com Estado):\*\* 
- Fácil, Médio, Difícil e Inferno, configurando dinamicamente a vida do jogador e do inimigo. 
- \*\*Sorteio Contíguo Proporcional:\*\* 
- O navio ocupa em células contíguas exatamente o dobro (\`2x\`) da vida do inimigo, garantindo alvos suficientes no tabuleiro de 20 casas. 
- \*\*Ciclo de Combate:\*\* 
- Tiros certeiros (\`HIT\`) removem a posição da frota e descontam vida do adversário. 
- Tiros na água (\`MISS\`) causam penalidade de vida ao jogador. 

## 🛠️ Como Executar 
\`\`\`bash 

# Compilar 
javac -d bin src/enums/\*.java src/entidades/\*.java src/BatalhaNaval.java

# Rodar 
java -cp bin BatalhaNaval

# TDD:
<img width="1135" height="545" alt="imagem" src="https://github.com/user-attachments/assets/a8d935d4-2e25-4c0f-bf09-00984d7a3bd0" />
