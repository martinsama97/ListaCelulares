package samaniego.martin.milista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adaptadorCelulares(val celulares_list: List<Celular>) : RecyclerView.Adapter<adaptadorCelulares.CelularesViewHolder>() {

     class CelularesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
         var imagen_celular: ImageView = itemView.findViewById(R.id.img_Telefono)
         var nombre_celular: TextView = itemView.findViewById(R.id.Tv_Nombre_Telefono)
         var sistema_celular: TextView = itemView.findViewById(R.id.tv_Sistema_Operativo_telefono)
         var memoria_celular: TextView = itemView.findViewById(R.id.tv_Memoria_Ram_telefono)
         var almacenamiento_celular: TextView = itemView.findViewById(R.id.tv_Almacenamiento_Interno_telefono)
         var pantalla: TextView = itemView.findViewById(R.id.tv_Pantalla_telefono)
         var camara: TextView = itemView.findViewById(R.id.tv_Camara_principal_telefono)
         var precio: TextView = itemView.findViewById(R.id.tv_Precio_telefono)

     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CelularesViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.lista_item, parent, false)
        return CelularesViewHolder(ItemView)
    }

    override fun getItemCount(): Int {
        return celulares_list.size
    }

    override fun onBindViewHolder(holder: CelularesViewHolder, position: Int) {
        val celular: Celular = celulares_list[position]
        holder.imagen_celular.setImageResource(celular.imagen)
        holder.nombre_celular.text = celular.nombre
        holder.sistema_celular.text = celular.sistemaOperativo
        holder.memoria_celular.text = celular.memoriaRam
        holder.almacenamiento_celular.text = celular.almacenamientoInterno
        holder.pantalla.text = celular.pantalla
        holder.camara.text = celular.camara
        holder.precio.text = celular.precio
    }
}