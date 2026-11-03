# MyAppDam1 · Jetpack Compose paso a paso

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?logo=jetpackcompose&logoColor=white)
![Material 3](https://img.shields.io/badge/Material%203-757575?logo=materialdesign&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?logo=androidstudio&logoColor=white)
![Curso](https://img.shields.io/badge/curso-2026%2F2027-orange)

Repositorio de clase del curso **2026/2027** del IES Virrey Morcillo (ciclo DAM). Aquí se suben, **a medida que los vamos viendo en clase**, los ejemplos de *composables* de **Jetpack Compose** con **Material 3**.

> 🚧 **Proyecto en construcción.** El repositorio crece a lo largo del curso. Si un tema todavía no aparece, es porque aún no lo hemos visto en clase.

🌐 **Web del proyecto:** https://ccnl10.github.io/AppDAM2627/

---

## 🎯 Objetivo

- Tener **todos los ejemplos de clase en un único proyecto Android**, ordenados por temas.
- Poder **consultar, ejecutar y modificar** cada ejemplo por separado.
- Ver la **evolución** de cada componente: del ejemplo más básico (`...0`) a versiones más completas (`...1`, `...2`, ...).
- Practicar con **ejercicios** basados en lo visto.

---

## 🧰 Requisitos

| Herramienta | Versión |
|---|---|
| Android Studio | Última versión estable |
| Kotlin | 2.x |
| SDK mínimo | API 24 (Android 7.0) |
| SDK objetivo | API 36 |
| JDK | 11 o superior (el que trae Android Studio) |

---

## 🚀 Cómo usar el proyecto

1. **Clona** el repositorio:
   ```bash
   git clone https://github.com/USUARIO/MyAppDam1.git
   ```
2. Ábrelo en **Android Studio** (`File > Open`) y espera a que termine la **sincronización de Gradle**.
3. Abre el fichero del ejemplo y usa el panel **Preview** (`@Preview`) para verlo sin ejecutar la app.
4. Para verlo en el **emulador o en un móvil**, llama al composable desde `MainActivity`, dentro del `Scaffold`:
   ```kotlin
   Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
       NombreDelEjemplo(modifier = Modifier.padding(innerPadding))
   }
   ```
5. Pulsa ▶️ **Run**.

> 💡 Para actualizar tu copia con los ejemplos nuevos de cada clase: `git pull`

---

## 🗂️ Organización del código

Todo el código está en `app/src/main/java/com/iesvirreymorcillo/myappdam1/`. Cada tema tiene su propio paquete:

```
myappdam1/
├── MainActivity.kt          ← punto de entrada: desde aquí se lanza cada ejemplo
├── ui/theme/                ← tema de la app (colores, tipografía)
├── Componentes/             ← composables básicos y layouts
├── ComponentesMaterial3/    ← componentes de Material 3
│   └── Ejercicios/          ← ejercicios propuestos
└── Estados/                 ← gestión del estado
```

Los recursos (imágenes, iconos vectoriales, animaciones) están en `app/src/main/res/` (`drawable/`, `raw/`, ...).

### Convenciones de nombres

| Patrón | Significado |
|---|---|
| `MyComponente0.kt` | Primer ejemplo, el más básico |
| `MyComponente1.kt`, `2`, ... | Ejemplos que añaden propiedades o casos nuevos |
| `...M3.kt` | Versión con componentes de **Material 3** |
| `...Avanzado...` | Ejemplos de ampliación |
| `E1...`, `E2...` | Ejercicios |

---

## 📚 Temario del curso

Se marca ✅ cada bloque cuando ya está subido al repositorio.

- [ ] **Primeros pasos**: estructura del proyecto, `MainActivity`, `setContent`, `Scaffold`, `@Preview`
- [ ] **Text**: texto, estilos, colores y tamaños
- [ ] **Layouts básicos**: `Column`, `Row`, `Box`, `Spacer` y scroll
- [ ] **ConstraintLayout**: restricciones, *guidelines*, *barriers* y cadenas
- [ ] **Pantalla de ejemplo**: diseño de un *login*
- [ ] **Estado**: `remember`, `rememberSaveable` y *state hoisting*
- [ ] **Material 3, texto y botones**: `Text`, `Button`, `TextButton`, `OutlinedButton`...
- [ ] **Entrada de texto**: `TextField` y `OutlinedTextField`
- [ ] **Imágenes e iconos**: `Image`, `Icon` y recursos vectoriales
- [ ] **Animaciones Lottie**
- [ ] **Controles de selección**: `Checkbox`, `TriStateCheckbox`, `RadioButton`, `Switch`
- [ ] **Indicadores de progreso**: circulares y lineales
- [ ] **Slider**
- [ ] *...y lo que vayamos viendo durante el curso*

---

## 📦 Librerías externas

Además de Compose y Material 3, a lo largo del curso se añadirán algunas librerías (por ejemplo **ConstraintLayout for Compose** o **Lottie**). Se gestionan con el catálogo de versiones `gradle/libs.versions.toml`. Cuando se añada una nueva, sincroniza Gradle tras el `git pull`.

---

## 👨‍🏫 Autor

**Cristian Navarro** · Profesor · IES Virrey Morcillo

Proyecto con fines **educativos**. Puedes usarlo y modificarlo para aprender.
