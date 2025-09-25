import os
import re

def renomear_arquivo(caminho_antigo):
    pasta, nome_arquivo = os.path.split(caminho_antigo)
    if not nome_arquivo.endswith(".java"):
        return caminho_antigo
    novo_nome = nome_arquivo[0].upper() + nome_arquivo[1:]
    caminho_novo = os.path.join(pasta, novo_nome)
    if caminho_novo != caminho_antigo:
        print(f"Renomeando arquivo: {nome_arquivo} -> {novo_nome}")
        os.rename(caminho_antigo, caminho_novo)
    return caminho_novo

def renomear_classe(caminho_arquivo):
    with open(caminho_arquivo, "r", encoding="utf-8") as f:
        conteudo = f.read()

    # Substitui ocorrências de declarações de classe: pode ser "public class", "class", "final class", etc.
    def substituir(match):
        palavra = match.group(1)
        nome = match.group(2)
        sufixo = match.group(3)  # resto da linha até a abertura de chaves ou final da sentença
        novo_nome = nome[0].upper() + nome[1:]
        # Se o nome não mudou, retorna o match inalterado:
        if nome == novo_nome:
            return match.group(0)
        print(f"Alterando nome da classe em {caminho_arquivo}: {nome} -> {novo_nome}")
        return f"{palavra}{novo_nome}{sufixo}"

    # Regex que captura palavras como "public ", "final ", "private ", ou até nenhum modificador antes de 'class'
    # Assim, a regex vai capturar a parte anterior ao nome da classe e a parte após.
    padrao = re.compile(r'(\b(?:public\s+|protected\s+|private\s+|abstract\s+|final\s+)?class\s+)(\w+)(\b)')
    novo_conteudo = re.sub(padrao, substituir, conteudo)

    if novo_conteudo != conteudo:
        with open(caminho_arquivo, "w", encoding="utf-8") as f:
            f.write(novo_conteudo)

def main():
    for raiz, dirs, arquivos in os.walk("."):
        for arquivo in arquivos:
            if arquivo.endswith(".java"):
                caminho_antigo = os.path.join(raiz, arquivo)
                caminho_atualizado = renomear_arquivo(caminho_antigo)
                renomear_classe(caminho_atualizado)

if __name__ == '__main__':
    main()