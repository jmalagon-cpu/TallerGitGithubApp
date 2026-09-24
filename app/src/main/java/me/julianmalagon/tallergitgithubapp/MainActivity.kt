package me.julianmalagon.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.julianmalagon.tallergitgithubapp.R
import me.julianmalagon.tallergitgithubapp.ui.theme.TallergitgithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallergitgithubAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TarjetaDePresentacion(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TarjetaDePresentacion(modifier: Modifier = Modifier) {
    // Contenedor principal centrado en la pantalla
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            shape = RoundedCornerShape(28.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // --- SECCIÓN 1: PERFIL ---
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Foto de perfil",
                    modifier = Modifier
                        .size(110.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.surfaceVariant),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Julián Malagón",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Text(
                    text = "Desarrollador Móvil Jr.",
                    fontSize = 17.sp,
                    color = Color(0xFF2196F3),
                    fontWeight = FontWeight.Medium
                )

                Spacer(modifier = Modifier.height(20.dp))
                HorizontalDivider(color = Color.LightGray.copy(alpha = 0.6f), thickness = 1.dp)
                Spacer(modifier = Modifier.height(16.dp))

                // --- SECCIÓN 2: DATOS ---
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "EDAD",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "22 años",
                        fontSize = 15.sp,
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "CORREO",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "jmalagon@unab.edu.co",
                        fontSize = 15.sp,
                        color = Color(0xFF2196F3),
                        textDecoration = TextDecoration.Underline
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "CIUDAD",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Bucaramanga, Colombia",
                        fontSize = 15.sp,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))
                HorizontalDivider(color = Color.LightGray.copy(alpha = 0.6f), thickness = 1.dp)
                Spacer(modifier = Modifier.height(16.dp))

                // --- SECCIÓN 3: SOBRE MÍ ---
                Text(
                    text = "SOBRE MI MATERIA FAVORITA",
                    fontSize = 11.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = "Me apasiona el Desarrollo de Aplicaciones Móviles porque permite transformar ideas en herramientas tangibles que las personas usan a diario. Me encanta el reto de diseñar interfaces intuitivas.",
                    fontSize = 13.sp,
                    color = Color.DarkGray,
                    textAlign = TextAlign.Center,
                    lineHeight = 18.sp
                )

                Spacer(modifier = Modifier.height(20.dp))

                // --- SECCIÓN 4: BOTÓN ---
                Button(
                    onClick = { /* Acción */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1E88E5))
                ) {
                    Text(
                        text = "Contactar conmigo",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}