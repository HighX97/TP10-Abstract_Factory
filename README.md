# TP10-Abstract_Factory
Fabrique abstraite On s’int ́eresse au d ́eveloppement d’un petit jeu de lettres. Dans ce jeu, on part d’une suite de mots pr ́ed ́efinie, et on encode cette suite en associant `a certaines lettres du mot un autre symbole (le mˆeme symbole pour chacune des occurences d’une mˆeme lettre). Cette suite encod ́ee de mots est pr ́esent ́ee au joueur, qui doit la d ́ecoder. Quand l’utilisateur propose une association lettre-symbole, selon que le jeu est assist ́e ou pas, on va lui indiquer ou pas si cette association est correcte. On pr ́esente en permanence au joueur la suite de mots en cours de d ́ecodage (dans son  ́etat de d ́ecodage courant), et les associations lettre/symbole que le joueur a propos ́ees. Les lettres et leur version accentu ́ee seront consid ́er ́ees dans une mˆeme classe d’ ́equivalence, ainsi on travaille sur 26 lettres. On veut pouvoir choisir 3 niveaux