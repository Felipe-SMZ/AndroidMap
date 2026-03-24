# 📱 MapaApp - Android com OSMDroid

Aplicativo Android desenvolvido em Kotlin que utiliza **OpenStreetMap (OSMDroid)** para exibir mapas, buscar endereços e adicionar marcadores.

---

## 🚀 Funcionalidades

- 🗺️ Exibição de mapa interativo
- 🔎 Busca de endereços
- 📍 Centralização automática no local buscado
- 📌 Adição de marcador no mapa

---

## 🛠️ Tecnologias Utilizadas

- Kotlin
- Android Studio
- OSMDroid (OpenStreetMap)
- Geocoder (Android)

---

## 📱 Demonstração

### 🔹 Tela inicial
![Mapa inicial](docs/assets/passo5.png)

### 🔹 Busca de endereço
![Busca](docs/assets/passo6.png)

### 🔹 Resultado com marcador
![Resultado](docs/assets/passo7.png)

---

## 📂 Estrutura do Projeto

```

.
├── app/
├── docs/
│   ├── Tutorial.md
│   └── assets/
│       ├── passo1.png
│       ├── passo2.png
│       ├── passo3.png
│       ├── passo4.png
│       ├── passo5.png
│       ├── passo6.png
│       └── passo7.png
└── README.md

````

---

## ⚙️ Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/mapaapp.git
````

### 2. Abra no Android Studio

* Clique em **Open**
* Selecione a pasta do projeto

### 3. Execute o projeto

* Conecte um dispositivo ou use um emulador
* Clique em **Run ▶️**

---

## 🔐 Permissões utilizadas

O aplicativo utiliza as seguintes permissões:

* `INTERNET` → carregar mapas
* `ACCESS_FINE_LOCATION` → localização precisa
* `ACCESS_COARSE_LOCATION` → localização aproximada

---

## ⚠️ Configuração importante

No `AndroidManifest.xml`, foi necessário adicionar:

```xml
android:usesCleartextTraffic="true"
```

Isso permite conexões HTTP utilizadas pelo OSMDroid.

---

## 📚 Tutorial completo

O passo a passo detalhado de desenvolvimento está disponível em:

📄 `docs/Tutorial.md`

---

## 💡 Melhorias futuras

* 📍 Botão "Minha localização"
* 📌 Suporte a múltiplos marcadores
* 💾 Histórico de buscas
* 🎨 Melhorias na interface (UI/UX)

---

## 👨‍💻 Autor

**Felipe Shimizu**

[![Portfolio](https://img.shields.io/badge/Portfólio-000?style=for-the-badge&logo=google-chrome&logoColor=white)](https://www.devfelipeshimizu.me/)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/felipesshimizu)

---

## 📄 Licença

Este projeto é apenas para fins educacionais.

