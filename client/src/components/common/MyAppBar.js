import Link from "next/link";

// MUI Imports
import AppBar from "@mui/material/AppBar";
import Box from "@mui/material/Box";
import Toolbar from "@mui/material/Toolbar";
import Typography from "@mui/material/Typography";
import Button from "@mui/material/Button";
import IconButton from "@mui/material/IconButton";
import MenuIcon from "@mui/icons-material/Menu";
import { ThemeProvider } from "@mui/material";
import { darkTheme, theme } from "@/styles/mui/theme";

export default function MyAppBar() {
  return (
    <>
      <ThemeProvider theme={theme}>
        <Box sx={{ flexGrow: 1 }}>
          <AppBar position="static" color="primary">
            <Toolbar>
              <IconButton
                size="large"
                edge="start"
                color="inherit"
                aria-label="menu"
                sx={{ mr: 2 }}
              >
                <MenuIcon />
              </IconButton>
              <Typography variant="h6" component="Box" sx={{ flexGrow: 1 }}>
                News
              </Typography>
              <Link href="/blog">
                <Button color="inherit">Blog</Button>
              </Link>
              <Button color="inherit">Login</Button>
            </Toolbar>
          </AppBar>
        </Box>
      </ThemeProvider>
    </>
  );
}
