package com.g4b3r.flowmusic.components



import android.appwidget.AppWidgetProvider
import android.appwidget.AppWidgetManager
import android.content.Context
import android.widget.RemoteViews
import com.g4b3r.flowmusic.R

class MeuWidget : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // Atualiza todos os widgets criados
        for (widgetId in appWidgetIds) {
            val views = RemoteViews(context.packageName, R.layout.example_appwidget)
            views.setTextViewText(R.id.widget_text, "Olá, Widget!")

            appWidgetManager.updateAppWidget(widgetId, views)
        }
    }
}
