//
// Created by Guilherme on 2021/08/28.
//

#ifndef UNTITLED4_INVPALAVRA_H
#define UNTITLED4_INVPALAVRA_H

#endif //UNTITLED4_INVPALAVRA_H

void inverter_palavras(char x[]){
    int i = 0;
    No *remover, *pilha = NULL;

    while(x[i] != '\0'){
        if(x[i] != ' ')
            pilha = empilhar(pilha, x[i]);
        else {
            while(pilha){
                remover = desempilhar(&pilha);
                printf("%c", remover->caracter);
                free(remover);
            }
            printf(" ");
        }
        i++;
    }
    while(pilha){
        remover = desempilhar(&pilha);
        printf("%c", remover->caracter);
        free(remover);
    }
    printf("\n");
}