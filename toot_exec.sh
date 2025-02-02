#!/bin/bash

toot() {
  user_command="$1"
  case $user_command in
    "start")
      echo starting
      ;;
    "edit")
      echo editing
      ;;
    "help")
      echo "commands that can be run are:"
      grep '")' toot_exec.sh | sed 's/"\(.*\)")/\1/' | grep -v "grep" | sed 's/ .* //'
      ;;
    *)
      echo "toot command \"$user_command\" not recognized. Type toot help for a list of toot commands"
      ;;
  esac
}

tt() {
  source ~/JavaProjects/Toot/toot_exec.sh
}