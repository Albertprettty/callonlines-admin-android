# CallOnLines Admin Android

App Android nativa (Kotlin) que envuelve el panel de administración `https://callonlines.com/root_login.php`.

## Diferencias con la app de cliente

- Apunta a `root_login.php` (no a `login.php`).
- Nombre: **CallOnLines Admin**.
- Paquete: `com.callonlines.admin`.
- Icono y splash con acento dorado (corona) para distinguirla visualmente de la app regular.

## Build automático

Hacer push a `main` → GitHub Actions compila la APK → descárgala desde **Actions → último workflow → Artifacts → CallOnLines-Admin-APK**.

## Cambiar URL de inicio

Edita `app/src/main/java/com/callonlines/admin/MainActivity.kt` → constante `START_URL`.
