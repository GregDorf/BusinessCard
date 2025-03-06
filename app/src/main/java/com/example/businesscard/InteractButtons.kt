package com.example.businesscard
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.ContactsContract

interface InteractButtons {
    fun Link(context: Context)
}

class PhoneButton: InteractButtons {
    override fun Link(context: Context) {
        val intent = Intent(ContactsContract.Intents.Insert.ACTION)
        intent.type = ContactsContract.RawContacts.CONTENT_TYPE
        intent.putExtra(ContactsContract.Intents.Insert.PHONE, "+7 952 403-74-29")
        context.startActivity(intent)
    }
}

class ShareButton: InteractButtons {
    override fun Link(context: Context) {
        val uri = Uri.parse("tg://resolve?domain=@Gr0G0R")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        context.startActivity(intent)
    }
}

class MailButton: InteractButtons {
    override fun Link(context: Context) {
        val uri = Uri.parse("mailto:gregdorf86@gmail.com")
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        intent.putExtra(Intent.EXTRA_SUBJECT, "Тема сообщения")
        intent.putExtra(Intent.EXTRA_TEXT, "Текст сообщения")
        context.startActivity(intent)
    }
}
