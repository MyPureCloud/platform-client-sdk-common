package profiles

import (
	"github.com/spf13/cobra"
)

var profileCmd = &cobra.Command{
	Use:   "profiles",
	Short: "Manages the application profiles",
	Long:  `Manages the application profiles`,
}

func Cmdprofiles() *cobra.Command {
	profileCmd.AddCommand(currentProfileCmd)
	profileCmd.AddCommand(createProfilesCmd)
	profileCmd.AddCommand(listProfilesCmd)
	return profileCmd
}
