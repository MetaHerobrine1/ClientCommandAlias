package me.metaherobrine1.client_cmd_alias
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.command.v1.ClientCommandManager

@Suppress("UNUSED")

object ClientCommandAlias: ClientModInitializer {
    private const val MOD_ID = "client_cmd_alias"

    override fun onInitializeClient() {
        ClientCommandManager.DISPATCHER.register(ClientCommandManager.literal("hub").executes { context ->
            context.source.player.sendChatMessage("/server hub")
            0
        })

        ClientCommandManager.DISPATCHER.register(ClientCommandManager.literal("creative").executes { context ->
            context.source.player.sendChatMessage("/server creative")
            0
        })

        ClientCommandManager.DISPATCHER.register(ClientCommandManager.literal("survival").executes { context ->
            context.source.player.sendChatMessage("/server survival")
            0
        })
    }
}
